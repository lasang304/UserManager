package net.lasang.usermanager.service;

import net.lasang.usermanager.model.Equipment;

import java.util.List;

public interface EquipmentService {
    public void addEquipment(Equipment equipment);

    public void updateEquipment(Equipment equipment);

    public void removeEquipment(int id);

    public Equipment getEquipmentById(int id);

    public List<Equipment> listEquipments(int id);
}
