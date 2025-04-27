package Assignment1;

public class Config {
	 private final String databaseUrl;
	    private final int maxConnections;
	    private final boolean debugMode;

	    public Config(String databaseUrl, int maxConnections, boolean debugMode) {
	        this.databaseUrl = databaseUrl;
	        this.maxConnections = maxConnections;
	        this.debugMode = debugMode;
	    }

	    public String getDatabaseUrl() {
	        return databaseUrl;
	    }

	    public int getMaxConnections() {
	        return maxConnections;
	    }

	    public boolean isDebugMode() {
	        return debugMode;
	    }

	    @Override
	    public String toString() {
	        return "Config{" +
	                "databaseUrl='" + databaseUrl + '\'' +
	                ", maxConnections=" + maxConnections +
	                ", debugMode=" + debugMode +
	                '}';
	    }
	}
