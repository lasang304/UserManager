package net.lasang.usermanager.model;

import javax.persistence.*;

@Entity
@Table(name = "EQUIPMENT")
public class Equipment {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String equipmentName;

    @Column(name = "S_N")
    private String equipmentSN;

    @Column(name = "SPECIFICATIONS")
    private String equipmentSpecifications;

    @Column(name = "TYPE")
    private String equipmentType;

    @Column(name = "OWNER_ID")
    private int equipmentOwnerId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public String getEquipmentSN() {
        return equipmentSN;
    }

    public void setEquipmentSN(String equipmentSN) {
        this.equipmentSN = equipmentSN;
    }

    public String getEquipmentSpecifications() {
        return equipmentSpecifications;
    }

    public void setEquipmentSpecifications(String equipmentSpecifications) {
        this.equipmentSpecifications = equipmentSpecifications;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
    }


    public int getEquipmentOwnerId() {
        return equipmentOwnerId;
    }

    public void setEquipmentOwnerId(int equipmentOwnerId) {
        this.equipmentOwnerId = equipmentOwnerId;
    }
}
