<?xml version="1.0" encoding="UTF-8"?>
<project-private xmlns="http://www.netbeans.org/ns/project-private/1">
    <editor-bookmarks xmlns="http://www.netbeans.org/ns/editor-bookmarks/2" lastBookmarkId="0"/>
    <open-files xmlns="http://www.netbeans.org/ns/projectui-open-files/2">
        <group/>
    </open-files>
</project-private>
                                                                                                                                                                         
    
    public Fraction3YingL(int n) // n will be use to assign to numerator
    {
        sign = 1;
        num = n;
        denom = 1;
    }
    
    public Fraction3YingL(int s, int n, int d)
    {
        sign = s; // need conditioning
        num = n;
        denom = d; // need conditioning
        
        // siplification
    }
    
    public int getSign()
    {
        
        return sign;
    }
    
    public int getNum()
    {
        return num;
    }
    
    public int getDenom()
    {
        return denom;
    }
    
    public void print()