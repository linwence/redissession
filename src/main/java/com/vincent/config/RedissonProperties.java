package com.vincent.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix ="redisson" )
public class RedissonProperties {
    private String address;
    private String password;
    //毫秒
    private int timeout=30000;
    private int database=0;
    private String sentinelAddress;
    private int connectionPoolSize=150;
    private int connectionMiniumIdleSize=10;
    private int slaveConnectionPoolSize=300;
    private int masterConnectionPoolSize=300;
    private String[] sentinelAddresses;
    private String[] masterAddresses;
    //毫秒
    private int scanInterval=2000;
    private String masterName;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public int getDatabase() {
        return database;
    }

    public void setDatabase(int database) {
        this.database = database;
    }

    public String getSentinelAddress() {
        return sentinelAddress;
    }

    public void setSentinelAddress(String sentinelAddress) {
        this.sentinelAddress = sentinelAddress;
    }

    public int getConnectionPoolSize() {
        return connectionPoolSize;
    }

    public void setConnectionPoolSize(int connectionPoolSize) {
        this.connectionPoolSize = connectionPoolSize;
    }

    public int getConnectionMiniumIdleSize() {
        return connectionMiniumIdleSize;
    }

    public void setConnectionMiniumIdleSize(int connectionMiniumIdleSize) {
        this.connectionMiniumIdleSize = connectionMiniumIdleSize;
    }

    public int getSlaveConnectionPoolSize() {
        return slaveConnectionPoolSize;
    }

    public void setSlaveConnectionPoolSize(int slaveConnectionPoolSize) {
        this.slaveConnectionPoolSize = slaveConnectionPoolSize;
    }

    public int getMasterConnectionPoolSize() {
        return masterConnectionPoolSize;
    }

    public void setMasterConnectionPoolSize(int masterConnectionPoolSize) {
        this.masterConnectionPoolSize = masterConnectionPoolSize;
    }

    public String[] getSentinelAddresses() {
        return sentinelAddresses;
    }

    public void setSentinelAddresses(String[] sentinelAddresses) {
        this.sentinelAddresses = sentinelAddresses;
    }

    public String[] getMasterAddresses() {
        return masterAddresses;
    }

    public void setMasterAddresses(String[] masterAddresses) {
        this.masterAddresses = masterAddresses;
    }

    public int getScanInterval() {
        return scanInterval;
    }

    public void setScanInterval(int scanInterval) {
        this.scanInterval = scanInterval;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }
}
