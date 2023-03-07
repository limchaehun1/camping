package camping.domain;

import camping.domain.*;
import camping.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class EquipmentPicked extends AbstractEvent {

    private Long id;
    private String equipmentName;
    private Long reserveId;
}

