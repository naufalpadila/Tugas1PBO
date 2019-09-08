public class operasi {
    double pi=3.14; //deklarasi pi
    double LuasBalok(double p, double l, double t){ //rumus Luas Balok
        return 2*((p*l)+(p*t)+(l*t));
    }
    
    double VolumeBalok(double p, double l, double t){ //rumus Volume Balok
        return p*l*t;
    }
    
    double LuasBola(double r){ //rumus Luas Bola
        return 4*pi*r*r;
    }
    double VolumeBola(double r){//rumus Volume Bola
        return pi*r*r*r*4/3;
    }
    
    double LuasKubus(double a){//rumus Luas Kubus
        return 6*(a*a);
    }
    
    double VolumeKubus(double a){//rumus Volume Kubus
        return a*a*a;
    }
    
    double LuasAlasKerucut(double r){//rumus Luas Alas Kerucut
        return pi*r*r;
    }
    
    double LuasSelimutKerucut(double r, double s){//rumus Luas Selimut Kerucut
        return pi*r*s;
    }
    
    double LuasPermukaanKerucut(double r, double s){//rumus Luas Permukaan Kerucut
        return pi*r*(r+s);
    }
    
    double VolumeKerucut(double r, double t){//rumus Volume Kerucut
        return pi*r*r*t*1/3;
    } 
    }

