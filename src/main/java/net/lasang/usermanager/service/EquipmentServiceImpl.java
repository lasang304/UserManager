package net.lasang.usermanager.service;

import net.lasang.usermanager.dao.EquipmentDao;
import net.lasang.usermanager.dao.UserDao;
import net.lasang.usermanager.model.Equipment;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class EquipmentServiceImpl implements EquipmentService {
    private EquipmentDao equipmentDao;

    public void setEquipmentDao(EquipmentDao equipmentDao) {
        this.equipmentDao = equipmentDao;
    }

    @Override
    @Transactional
    public void addEquipment(Equipment equipment) {
        this.equipmentDao.addEquipment(equipment);
    }

    @Override
    @Transactional
    public void updateEquipment(Equipment equipment) {
        this.equipmentDao.updateEquipment(equipment);
    }

    @Override
    @Transactional
    public void removeEquipment(int id) {
        this.equipmentDao.removeEquipment(id);
    }

    @Override
    @Transactional
    public Equipment getEquipmentById(int id) {
        return this.equipmentDao.getEquipmentById(id);
    }

    @Override
    @Transactional
    public List<Equipment> listEquipments(int id){
        return  this.equipmentDao.listEquipments(id);
    }
}
