package designpattern.structural.adapter.client;

import designpattern.structural.adapter.adaptee.WeightMachineForBabies;
import designpattern.structural.adapter.adapter.WeightMachineAdapter;
import designpattern.structural.adapter.adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
