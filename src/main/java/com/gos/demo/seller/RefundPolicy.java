package com.gos.demo.seller;

public enum RefundPolicy implements EnumElementV2 {
    A("A정책"),B("B정책"),C("C정책"),D("D정책"),E("E정책"),F("F정책");

    private String code;
    private String label;

    RefundPolicy(String label) {
        this.code = this.name();
        this.label = label;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getLabel() {return label;}

}
