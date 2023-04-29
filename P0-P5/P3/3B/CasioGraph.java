public class CasioGraph implements GraphCalculator {
    private Point point;
    private int batteryLevel;
    private Boolean status;

    public CasioGraph(int x, int y) {
        this.point = new Point(x, y);
        this.batteryLevel = 100;
        this.status = false;
    }

    @Override
    public int add(int a, int b) {
        if (!status) {
            return -1;
        }

        this.batteryLevel = this.batteryLevel - 10;
        if (batteryLevel == 0) {
            this.status = false;
        }
        return a + b;
    }
    
    @Override
    public int substract(int a, int b) {
        if (!status) {
            return -1;
        }

        this.batteryLevel = this.batteryLevel - 10;
        if (batteryLevel == 0) {
            this.status = false;
        }
        return a - b;
    }
    
    @Override
    public int multiply(int a, int b) {
        if (!status) {
            return -1;
        }

        this.batteryLevel = this.batteryLevel - 10;
        if (batteryLevel == 0) {
            this.status = false;
        }
        return a * b;
    }
    
    @Override
    public double divide(int a, int b) {
        if (!status) {
            return -1;
        }

        this.batteryLevel = this.batteryLevel - 10;
        if (batteryLevel == 0) {
            this.status = false;
        }
        return (double) a / b;
    }
    
    @Override
    public void start() {
        if (batteryLevel > 0) {
            this.status = true;
        } else {
            this.status = false;
        }
    }
    
    @Override
    public void stop() {
        this.status = false;
    }
    
    @Override
    public int checkBattery() {
        return batteryLevel;
    }
    
    @Override
    public void shiftX(int shiftCount) {
        if (status) {
            this.batteryLevel = this.batteryLevel - 10;
            if (batteryLevel == 0) {
                this.status = false;
            }
            point.setX(add(shiftCount, point.getX()));
        }
    }
    
    @Override
    public void shiftY(int shiftCount) {
        if (status) {
            this.batteryLevel = this.batteryLevel - 10;
            if (batteryLevel == 0) {
                this.status = false;
            }
            point.setY(add(shiftCount, point.getY()));
        }
    }
    
    @Override
    public double distance(int x, int y) {
        if (!status) {
            return -1;
        }

        this.batteryLevel = this.batteryLevel - 10;
        if (batteryLevel == 0) {
            this.status = false;
        }
        return Math.sqrt(Math.pow(substract(x, point.getX()), 2) + Math.pow(substract(y, point.getY()), 2));
    }

    public Boolean getStatus() {
        return this.status;
    } 

    public Point gePoint() {
        return this.point;
    }

    public void charge() {
        this.batteryLevel = 100;
        this.status = true;
    }
}
