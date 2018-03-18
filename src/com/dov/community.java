package com.dov;
import sun.security.util.Length;

import java.util.*;

public class community {
    List<CommunityMember> cm;

    public community() {
        cm = new ArrayList<CommunityMember>();
    }

    public List<CommunityMember> getCommunityMember() {
        return cm;
    }

    public void addMember(CommunityMember newMember) {
        this.cm.add(newMember);
    }

    public int texAllMembers() {
        int sum = 0;
        for (CommunityMember member : getCommunityMember()) {

            sum += member.CommunityTax();
        }
        return sum;
    }
    public int sumGemach(int id)
    {
        for(CommunityMember member : cm)
        {
            if(member.getId() == id){
                return member.MaxLoan();
            }
        }
        return -1;
    }
    public String sumVoluteering()
    {
        String sumVo1="spiritually \n";
        String sumVo2="physically \n";
        String sumVo3="musical \n";
        String sumVoluteering="";
        for(CommunityMember member : getCommunityMember()) {
            if(member.getTypeVolunteering() == TypeVolunteering.spiritually) {
                sumVo1 += member.getId();
                sumVo1 += member.SumHoursVolunteeringRecommended();
                sumVo1 += "\n";
            }
            if(member.getTypeVolunteering() == TypeVolunteering.physically) {
                sumVo2 += member.getId();
                sumVo2 += member.SumHoursVolunteeringRecommended();
                sumVo2 += "\n";
            }
            if(member.getTypeVolunteering() == TypeVolunteering.musical) {
                sumVo3 += member.getId();
                sumVo3 += member.SumHoursVolunteeringRecommended();
                sumVo3 += "\n";
            }


        }
        sumVoluteering+=sumVo1;
        sumVoluteering+="\n";
        sumVoluteering+=sumVo2;
        sumVoluteering+="\n";
        sumVoluteering+=sumVo3;
        sumVoluteering+="\n";
        return sumVoluteering;
    }
}