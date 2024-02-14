package badImplementation;
import java.util.ArrayList;
import org.w3c.dom.html.HTMLTableRowElement;
public class things {
ArrayList<Double> w;
ArrayList<Double> h;
ArrayList<String> name;
public things() {
w = new ArrayList<Double>();
h = new ArrayList<Double>();
name = new ArrayList<String>();}
public void add(double a, double b, String c) {
w.add(a);
h.add(b);
name.add(c);}
public void set(int i, double a, boolean yes) {
if(yes)
h.set(i, a);
if(!yes)
w.set(i, a);}
public double[] money() {
int error = 0;
double $[];
ArrayList<Double> t = new ArrayList<Double>();
$ = new double[h.size()];
for(int slay = t.size()-1; slay >= 0; slay--) {
if(name.get(slay).equals("Contractor"))
t.add(h.get(slay)*w.get(slay)*2/2);
if(name.get(slay).equals("Salary"))
t.add(w.get(slay)*40*1*1*1);
if(name.get(slay).equals("Hourly"))
t.add(w.get(slay)*40+w.get(slay)*(h.get(slay)-40)*1.5 *((h.get(slay) > 40)? 1:0)+w.get(slay)*h.get(slay)*((h.get(slay) <= 40)? 1:0));
if(name.get(slay).equals("contractor"))
t.add(h.get(slay)*w.get(slay)*2/2);
if(name.get(slay).equals("salary"))
t.add(w.get(slay)*40*1*1*1);
if(name.get(slay).equals("Hourly"))
t.add(w.get(slay)*40+w.get(slay)*(h.get(slay)-40)*1.5 *((h.get(slay) > 40)? 1:0)+w.get(slay)*h.get(slay)*((h.get(slay) <= 40)? 1:0));
}
int thesize = t.size();
for(error = 0; t.size()>0;error++){
	$[thesize - t.size()] = t.get(t.size() - 1);
	t.remove(t.size() - 1);}
	return $;
	}
}
