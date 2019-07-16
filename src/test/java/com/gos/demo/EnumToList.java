package com.gos.demo;

import com.gos.demo.seller.EnumElementV2;
import com.gos.demo.seller.RefundPolicy;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EnumToList {

    @Test
    public void testForEnumToList(){
        List<EnumElementV2> sellers = Arrays.stream(RefundPolicy.values()).collect(Collectors.toList());
        assertEquals(6,sellers.size());
        sellers.forEach(e->{
            System.out.println(e.getLabel());
            System.out.println(e.getCode());
        });
    }

    @Test
    public void testForEnumToListNotInterface() {
        List<RefundPolicy> policies = Arrays.stream(RefundPolicy.values()).collect(Collectors.toList());
        assertEquals(6,policies.size());
        policies.forEach(e->{
            System.out.println(e);
            System.out.println(e.getLabel());
            System.out.println(e.getCode());
        });
    }
}
