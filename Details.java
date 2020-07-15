public class Details {
    String fullname, address;
    Details() {}
    Details(String fn, String addr) {
        this.fullname = fn;
        this.address = addr;
    }

    public String getFullname() {
        return this.fullname;
    }
    public void setFullname(String fn) {
        this.fullname = fn;
    }

    public String getAddress() {
        return this.address;
    }
    public void setAddress(String addr) {
        this.address = addr;
    }

    public String toString()  {
        return "Name: " + this.fullname + " Address: " + this.address;
    }
    public boolean equals(Details d) {
        if (d.fullname == this.fullname && d.address == this.address) {
            return true;
        }
        else {
            return false;
        }
    }
}
