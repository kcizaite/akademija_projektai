package lt.techin.karolina.truckManagerProject;

import lt.itakademija.exam.Packet;
import lt.itakademija.exam.Truck;
import lt.itakademija.exam.TruckManager;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TruckManagerImpl implements TruckManager {

    List<Truck> truck = new ArrayList<>();
    List<Packet> packets = new ArrayList<>();

    @Override
    public Truck registerTruck(String id, int capacity) {
        if (capacity <= 0 || id.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Truck truck1 = new Truck(id, capacity);
        this.truck.add(truck1);
        return truck1;
    }

    @Override
    public List<Truck> getTrucks() {
        return this.truck;
    }

    @Override
    public Truck getTruckById(String id) {
        return truck.stream().filter(truck1 -> truck1.getId().matches(id)).findFirst().orElse(null);
    }

    @Override
    public Packet registerPacket(String id, int volume) {
        if (volume <= 0 || id.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Packet packet1 = new Packet(id, volume);
        this.packets.add(packet1);
        return packet1;
    }

    @Override
    public void assignTruck(Truck truck, Packet packet) {
        packet.assignTruck(truck);
    }

    @Override
    public List<Packet> getPackets(String truckId) {
        return packets.stream().filter(packet -> packet.getAssignedTruck().getId().matches(truckId)).collect(Collectors.toList());
    }

    @Override
    public int getTotalTruckCapacity() {
        return truck.stream().mapToInt(Truck::getCapacity).sum();
    }
}
