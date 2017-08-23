package net.lasang.usermanager.dao;

import net.lasang.usermanager.model.Equipment;

import java.util.List;

public interface EquipmentDao {
    public void addEquipment(Equipment equipment);

    public void updateEquipment(Equipment equipment);

    public void removeEquipment(int id);

    public Equipment getEquipmentById(int id);

    public List<Equipment> listEquipments(int userId);
}
