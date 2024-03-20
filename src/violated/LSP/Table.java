package violated.LSP;

import java.sql.Time;
import java.time.LocalTime;

public class Table
{
    private final int tableId;
    private boolean availability;

    public LocalTime timeSeated;
    public LocalTime timeAllotted;

    public Table(int tableId, boolean availability)
    {
        this.tableId = tableId;
        this.availability = availability;
    }
    public int getTableId() { return this.tableId; };
    public boolean isAvailable()
    {
        return this.availability;
    }
    public void setAvailability(boolean availability) { this.availability = availability; }
    public LocalTime getTimeSeated() { return this.timeSeated; }
    public void setTimeSeated(LocalTime timeSeated) { this.timeSeated = timeSeated; }
    public LocalTime getTimeAllotted() { return this.timeAllotted; }
    public void setTimeAllotted(LocalTime timeAllotted) { this.timeAllotted = timeAllotted; }
}
