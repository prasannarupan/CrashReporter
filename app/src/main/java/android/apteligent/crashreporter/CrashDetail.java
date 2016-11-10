package android.apteligent.crashreporter;

import com.google.gson.annotations.SerializedName;

/**
 * Created by prasannarupan on 11/7/16.
 */

public class CrashDetail {

    @SerializedName("status")
    private String status;
    @SerializedName("reason")
    private String reason;
    @SerializedName("displayReason")
    private String displayReason;
    @SerializedName("hash")
    private String hash;
    @SerializedName("name")
    private String name;
    @SerializedName("isSymbolized")
    private boolean isSymbolized;
    @SerializedName("lastOccurred")
    private String lastOccurred;
    @SerializedName("uniqueSessionCount")
    private int uniqueSessionCount;
    @SerializedName("sessionCount")
    private int sessionCount;
    @SerializedName("suspectLine")
    private String suspectLine;

    public CrashDetail(String status, String reason, String displayReason, String hash, String name, boolean isSymbolized, String lastOccurred, int uniqueSessionCount, int sessionCount, String suspectLine) {
        this.status = status;
        this.reason = reason;
        this.displayReason = displayReason;
        this.hash = hash;
        this.name = name;
        this.isSymbolized = isSymbolized;
        this.lastOccurred = lastOccurred;
        this.uniqueSessionCount = uniqueSessionCount;
        this.sessionCount = sessionCount;
        this.suspectLine = suspectLine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDisplayReason() {
        return displayReason;
    }

    public void setDisplayReason(String displayReason) {
        this.displayReason = displayReason;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSymbolized() {
        return isSymbolized;
    }

    public void setSymbolized(boolean symbolized) {
        isSymbolized = symbolized;
    }

    public String getLastOccurred() {
        return lastOccurred;
    }

    public void setLastOccurred(String lastOccurred) {
        this.lastOccurred = lastOccurred;
    }

    public int getUniqueSessionCount() {
        return uniqueSessionCount;
    }

    public void setUniqueSessionCount(int uniqueSessionCount) {
        this.uniqueSessionCount = uniqueSessionCount;
    }

    public int getSessionCount() {
        return sessionCount;
    }

    public void setSessionCount(int sessionCount) {
        this.sessionCount = sessionCount;
    }

    public String getSuspectLine() {
        return suspectLine;
    }

    public void setSuspectLine(String suspectLine) {
        this.suspectLine = suspectLine;
    }


    @Override
    public String toString() {
        return "CrashDetail{" +
                "status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", displayReason='" + displayReason + '\'' +
                ", hash='" + hash + '\'' +
                ", name='" + name + '\'' +
                ", isSymbolized=" + isSymbolized +
                ", lastOccurred='" + lastOccurred + '\'' +
                ", uniqueSessionCount=" + uniqueSessionCount +
                ", sessionCount=" + sessionCount +
                ", suspectLine='" + suspectLine + '\'' +
                '}';
    }


}
