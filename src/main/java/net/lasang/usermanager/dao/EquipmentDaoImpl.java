package net.lasang.usermanager.dao;

import net.lasang.usermanager.model.Equipment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EquipmentDaoImpl implements EquipmentDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addEquipment(Equipment equipment) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(equipment);
    }

    @Override
    public void updateEquipment(Equipment equipment) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(equipment);
    }

    @Override
    public void removeEquipment(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Equipment equipment = (Equipment) session.load(Equipment.class, id);
        if(equipment!=null){
            session.delete(equipment);
        }
    }

    @Override
    public Equipment getEquipmentById(int id){
        Session session = this.sessionFactory.getCurrentSession();
        return (Equipment)session.get(Equipment.class, id);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Equipment> listEquipments(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return  session.createQuery("from Equipment").list();
    }
}
