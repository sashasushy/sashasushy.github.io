package org.firstinspires.ftc.teamcode;
public class RobotLocation{
    double angle;
    double x;

    double y;
    public RobotLocation (double angle) {
        this.angle = angle;
    }
    public double getHeading() {
        double angle = this.angle;
        while(angle > 180) {
            angle-=360;
        }
        while(angle < -180) {
            angle += 360;
        }
        return angle;
    }
    //@NonNull
    //am intrat intr-un rabbit hole sa aflu despre tag-ul de mai sus
    //practic eu acm am warning (nu eroare) fiindca toString cand a fost definit avea (si are) tagul @RecentlyNonNull
    //IDE-ul imi reaminteste ca ”bai frate, functia asta normal ar trebui sa nu returneze null, nu asa ai vrea si tu?
    //inafara faptului ca rezolva warning daca returnez null o sa ma anunte programul ( da handle mai sigur practic)
    //oricum e cam irelevant asta dar na mi se pare interesantel :)
    @Override
    public String toString() {
        return "RobotLocation: angle (" + angle + ")";
    }
    public void turn (double angleChange) {
        angle += angleChange;
    }
    public void setAngle (double angle) {
        this.angle = angle;
    }
    public double getAngle()
    {
        return angle;
    }
    public double getX()
    {
        return x;
    }
    public void changeX(double change)
    {
        x+=change;
    }
    public void setX(double x)
    {
        this.x=x;
    }
    public void changeY(double change)
    {
        y+=change;
    }
    //urmatoarele doua functii NU au fost scrise de mine ci facute automat de android studio!
    //cum adica? - Dand right click pe variabila y si dand generate pot face functii 'setter' si 'getter'
    //destul de fain!
    //(also nu am umblat cu semnul lui y deoarece nu luam y din joycon si este o variabila definita de noi ce presupunem ca e cu semnul corect si o prelucram ca atare )
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
