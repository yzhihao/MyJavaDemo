package mediatorpattern;

class ColleagueA extends AbstractColleague{

	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.AaffectB();
	}
}