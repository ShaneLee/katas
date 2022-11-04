class TimeMap {

    private final Map<String, TreeMap<Integer, String>> map;


    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.compute(key, (k, v) -> {
            if (v == null) {
                final TreeMap<Integer, String> m = new TreeMap<>();
                m.put(timestamp, value);
                return m;
            }
            v.put(timestamp, value);
            return v;
        });
    }
    
    public String get(String key, int timestamp) {
        final var t = map.get(key);
        if (t == null) return "";
        final var k = t.floorKey(timestamp);
        if (k == null) return "";
        return t.get(k);
    }
}

