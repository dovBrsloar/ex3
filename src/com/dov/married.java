package com.dov;

import com.dov.com.dov.DebtsRights;

public class married extends CommunityMember {
    int idOther;
    int numChild;

    public married(int id, gen gender, String name, String addres,
                   String birthday, float sumHoursTorah, float sumHoursWork,
                   float salary, int survivorGemach, TypeVolunteering typeVolunteering, int idOther,
                   int numChild)
    {
        super(id, gender, name, addres, birthday, sumHoursTorah, sumHoursWork, salary, survivorGemach, typeVolunteering);
        setIdOther(idOther);
        setNumChild(numChild);
    }

    public void setIdOther(int idOther) {
        this.idOther = idOther;
    }

    public void setNumChild(int numChild) {
        this.numChild = numChild;
    }

    public int getIdOther() {
        return idOther;
    }

    public int getNumChild() {
        return numChild;
    }
    @Override
    public int CommunityTax() {
        if(getSumHoursTorah()>= 80)
        {
            return 0;
        }
        else if(getSumHoursTorah()>=50)
        {
            if(getSalary()<9000) {
                return 50;
            }
        }
        return 150;
    }

    @Override
    public int MaxLoan() {
        if(getSalary()>4000 && getSalary() <9000 && getSumHoursTorah()>=50)
            return 20000;
        if(getSalary()>=9000)
            return 15000;
        return 2000;
    }

    @Override
    public boolean CommunityMemberMarried() {
        return true;
    }

    @Override
    public float SumHoursVolunteeringRecommended() {
        if(getSumHoursTorah()>=80)
            return 1;
        else if(getSumHoursTorah()>=50)
            return 2;
        return 3;
    }
}
