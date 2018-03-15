package com.dov;
import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;

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
    public int sumGemach(CommunityMember member)
    {
        int sum =0;
        sum=member.MaxLoan();
        return sum;
    }
    public List<Float> sumVoluteering()
    {
        List<Float> sv;
        for(CommunityMember member : getCommunityMember())
        {
            if(member.typeVolunteering == TypeVolunteering.spiritually)
        }

    }
}