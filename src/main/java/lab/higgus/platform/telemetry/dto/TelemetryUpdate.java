package lab.higgus.platform.telemetry.dto;

import java.time.LocalDateTime;

public class TelemetryUpdate {

    private String sourceId;

    private String deviceId;

    private LocalDateTime receivedAt;

    private LocalDateTime sampledAt;

    private PositionTelemetry position;

}