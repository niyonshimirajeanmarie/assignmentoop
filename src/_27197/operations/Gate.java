package _27197.operations;

public class Gate {

    private String gateId;
    private Terminal terminal;
    private String status;

    public Gate(String gateId, Terminal terminal, String status) {
        this.gateId = gateId;
        this.terminal = terminal;
        this.status = status;
    }
}