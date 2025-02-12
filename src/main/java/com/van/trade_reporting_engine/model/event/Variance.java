package com.van.trade_reporting_engine.model.event;

import jakarta.xml.bind.annotation.XmlAccessorType;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.xml.bind.annotation.XmlAccessType.FIELD;

@Data
@NoArgsConstructor
@XmlAccessorType(FIELD)
public final class Variance {
    private boolean closingLevel;
    private int expectedN;
    private VarianceAmount varianceAmount;
    private double varianceStrikePrice;
    private boolean varianceCap;
    private double vegaNotionalAmount;
}