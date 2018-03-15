package com.dov;

import com.dov.com.dov.DebtsRights;

public abstract class CommunityMember implements DebtsRights {
    int id;
    gen gender;
    String name;
    String addres;
    String birthday;
    float sumHoursTorah;
    float sumHoursWork;
    float salary;
    int survivorGemach;
    TypeVolunteering typeVolunteering;

    public CommunityMember(int id, gen gender, String name, String addres,
                           String birthday, float sumHoursTorah, float sumHoursWork,
                           float salary, int survivorGemach, TypeVolunteering typeVolunteering)
    {
        setId(id);
        setGender(gender);
        setName(name);
        setAddres(addres);
        setBirthday(birthday);
        setSumHoursTorah(sumHoursTorah);
        setSumHoursWork(sumHoursWork);
        setSalary(salary);
        setSurvivorGemach(survivorGemach);
        setTypeVolunteering(typeVolunteering);
    }
    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setGender(gen gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setSumHoursTorah(float sumHoursTorah) {
        this.sumHoursTorah = sumHoursTorah;
    }

    public void setSumHoursWork(float sumHoursWork) {
        this.sumHoursWork = sumHoursWork;
    }

    public void setSurvivorGemach(int survivorGemach) {
        this.survivorGemach = survivorGemach;
    }

    public void setTypeVolunteering(TypeVolunteering typeVolunteering) {
        this.typeVolunteering = typeVolunteering;
    }

    public String getAddres() {
        return addres;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public float getSumHoursTorah() {
        return sumHoursTorah;
    }

    public float getSumHoursWork() {
        return sumHoursWork;
    }

    public int getId() {
        return id;
    }

    public int getSurvivorGemach() {
        return survivorGemach;
    }

    public TypeVolunteering getTypeVolunteering() {
        return typeVolunteering;
    }
    public gen getGender(gen gender)
    {
        return gender;
    }
}
