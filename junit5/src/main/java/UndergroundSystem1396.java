import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem1396 {
    Map<String, Integer> timeSum = new HashMap<>();
    Map<String, Integer> count = new HashMap<>();
    Map<Integer, StationAndTime> ongoing = new HashMap<>();

    public UndergroundSystem1396() {

    }

    public void checkIn(int id, String stationName, int t) {
        ongoing.put(id, new StationAndTime(t, stationName));

    }

    public void checkOut(int id, String stationName, int t) {
        StationAndTime obj = ongoing.remove(id);
        int timeElapsed = t - obj.time;
        String key = "" + obj.station + ":" + stationName;
        timeSum.put(key, timeSum.getOrDefault(key, 0) + timeElapsed);
        count.put(key, count.getOrDefault(key, 0) + 1);
    }

    public double getAverageTime(String startStation, String endStation) {
        String key = "" + startStation + ":" + endStation;
        return Double.valueOf(timeSum.get(key)) / count.get(key);
    }
}

class StationAndTime {
    int time;
    String station;

    public StationAndTime(int time, String station) {
        this.time = time;
        this.station = station;
    }
}
