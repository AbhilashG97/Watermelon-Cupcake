package student;

import java.io.Serializable;

public class Marks implements Serializable{

	private double firstInternals, secondInternals,attendance,endSem,m,contEval;

	public void setFirstInternals(double value){
		firstInternals = (value/50)*15;
	}
	public double getFirstInternals(){
        return firstInternals;
	}
	public void setSecondInternals(double value){
		secondInternals = (value/50)*15;
	}
	public double getSecondInternals(){
        return secondInternals;
	}
	public void setAttendance(double value){
		attendance = value;
	}
	public double getAttendance(){
        return attendance;
	}
	public void setcontEval(double value){
		contEval = value;
	}
	public double getContEval(){
        return contEval;
	}
	public void setEndSem(double value){
		endSem = value/2;
	}
	public double getEndSem(){
        return endSem;
	}


	public double getTotalAverage(){
		m = (getFirstInternals()+getFirstInternals()+getAttendance()+  getEndSem());
		return m;
	}
	public String getGrade(){
		if(getAttendance()>0){
         if(m>95)
         	return "O";
         else if((m<95)&&(m<85))
         	return "A+";
         else if((m<85)&&(m>75))
         	return "A";
         else if((m<75)&&(m>65))
         	return "B+";
         else if((m<65)&&(m>55))
         	return "B";
         else if((m<55)&&(m>45))
         	return "C";
         else if((m<45)&&(m>35))
         	return "P";
         else
         	return "F";
	}
	else
		return "FA"; }

	public String toString(){
		return "Average Marks: "+" "+this.getTotalAverage()+" "+"Grade: "+this.getGrade();
	}

}
