public class Period
{
	private Time start;
	private Time finish;

	public Period(Time time1, Time time2)
	{
		this.start = time1;
		this.finish = time2;
	}

	public boolean overlaps(Period period)
	{
		if(period.start.isLater(this.start) &&  this.finish.isLater(period.start))
	    	return true;
	    if(this.finish.isLater(period.start) && period.finish.isLater(this.start))
	    	return true;

		return false;

	}

   public String toString()
   {
      return this.start + " -> " + this.finish;
   }

}
