package badImplementation;
import java.util.ArrayList;
import org.w3c.dom.html.HTMLTableRowElement;
public class things {
ArrayList<Double> hours;
ArrayList<Double> wage;
ArrayList<String> name;
ArrayList<String> people;
public things() {
	/*
	 * This is a counter for the number of hours spent refactoring this code. When you look at this code
	 * and are unable to fix it, add to the counter and submit without changes.
	 * 
	 * Current counter: 402
	 */
this.hours = new ArrayList<Double>();
this.wage = new ArrayList<Double>();
this.name = new ArrayList<String>();
this.people = new ArrayList<String>();}
public void add(String p, double a, double b, String c) {
this.people.add(p);
this.hours.add(a);
this.wage.add(b);
this.name.add(c);}
public void set(int i, double a, boolean yes) {
if(yes)
this.wage.set(i, a);
if(!yes)
this.hours.set(i, a);}
public double[] money() {
	//whether code returned successfully
	int error = 0;
double $[];
//luv slayyyy
ArrayList<Double> t = new ArrayList<Double>();
$ = new double[this.hours.size()];
for(int slay = this.hours.size()-1; slay >= 0; slay--) {
if(this.name.get(slay).equals("Contractor"))
t.add(this.wage.get(slay)*this.hours.get(slay)*2/2);
if(this.name.get(slay).equals("Salary"))
t.add(this.hours.get(slay)*40*1*1*1);
if(this.name.get(slay).equals("Hourly"))
{
if(wage.get(slay) > 40) t.add((this.wage.get(slay) - 40.0) * this.hours.get(slay) * 1.5 + 40.0 * this.hours.get(slay));
else t.add(this.wage.get(slay) * this.hours.get(slay));
	
}
//t.add(this.w.get(slay)*40+this.w.get(slay)*(this.h.get(slay)-40)*1.5 *((this.h.get(slay) > 40)? 1:0) + this.w.get(slay)*this.h.get(slay)*((this.h.get(slay) <= 40)? 1:0));
if(this.name.get(slay).equals("contractor"))
	//for case
t.add(this.wage.get(slay)*this.hours.get(slay)*2/2);
if(this.name.get(slay).equals("salary"))
	//for cases
t.add(this.hours.get(slay)*40*1*1*1);
if(this.name.get(slay).equals("hourly"))
t.add(this.hours.get(slay)*40+this.hours.get(slay)*(this.wage.get(slay)-40)*1.5 *((this.wage.get(slay) > 40)? 1:0)+this.hours.get(slay)*this.wage.get(slay)*((this.wage.get(slay) <= 40)? 1:0));
}
int thesize = t.size(); //the size of t
for(error = 0; t.size()>0;error++){
	$[thesize - t.size()] = t.get(t.size() - 1);
	t.remove(t.size() - 1);}
	return $;
	}
}
