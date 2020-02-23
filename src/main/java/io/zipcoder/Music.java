package io.zipcoder;

import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {


        int a = Arrays.asList(playList).indexOf(startIndex)+1;

        int b = Arrays.asList(playList).indexOf(selection)-1;


            return  b-a;
        }

    }





        /*
        logic:  a. find starting index of song playing.
                b. find index of desired song
                c. return difference of song playing and desired song

            if index of b > index of a {
            return b -a;
            }
            else {
            if index b < index a {
            return a - b
            }

         */



