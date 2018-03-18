package com.dov;

import com.dov.com.dov.DebtsRights;

public  class single extends CommunityMember {
    int yearsEducation;

    public single(int id, gen gender, String name, String addres,
                  String birthday, float sumHoursTorah, float sumHoursWork,
                  float salary, int survivorGemach, TypeVolunteering typeVolunteering,
                  int yearsEducation)
    {
        super(id, gender, name, addres, birthday, sumHoursTorah, sumHoursWork, salary, survivorGemach, typeVolunteering);
        setYearsEducation(yearsEducation);
    }
    public void setYearsEducation(int yearsEducation) {
        this.yearsEducation = yearsEducation;
    }

    public int getYearsEducation() {
        return yearsEducation;
    }

    @Override
    public int CommunityTax() {
        if(getSumHoursTorah()>= 84)
        {
            return 0;
        }
        else if(getSumHoursTorah()>=56)
        {
            if(getSalary()<8000)
            {
                return 50;
            }
            else
                return 100;
        }

        return 100;
    }

    @Override
    public int MaxLoan() {
        return 0;
    }

    @Override
    public boolean CommunityMemberMarried() {
        return false;
    }

    @Override
    public float SumHoursVolunteeringRecommended() {
        if(getSumHoursTorah()>=84)
            return 2;
        else if(getSumHoursTorah()>=56)
            return 4;
        return 6;
    }
}
