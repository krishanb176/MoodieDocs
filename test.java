import java.net.*;
import java.io.*;
import java.util.*;

class test{
  public static void main(String[] args) {
    GeoipifyAPIQuery gIP = new GeoipifyAPIQuery();
    String timezone = gIP.getTimezone();
    System.out.println(timezone);
    TimeZone tk = gIP.tzz();
    gIP.tzzx();

  }
}
