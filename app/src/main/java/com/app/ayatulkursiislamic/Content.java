package com.app.ayatulkursiislamic;

import java.util.ArrayList;

/**
 * Created by Krishna on 02-05-2015.
 */


public class Content {

    public static ArrayList<String> Names;
    public static ArrayList<String> NamesSub;
    public static ArrayList<String> Images;
    public static ArrayList<String> Wallpaper;
    public static ArrayList<String> Audio;
    public static ArrayList<String> BIG_Images;
    public static ArrayList<String> Sub_heading;
    public static ArrayList<String> Description;


    Content(){
        this.Names = new ArrayList<String>();
        this.NamesSub = new ArrayList<String>();
        this.Sub_heading = new ArrayList<String>();
        this.Images = new ArrayList<String>();
        this.Wallpaper = new ArrayList<String>();
        this.BIG_Images = new ArrayList<String>();
        this.Audio = new ArrayList<String>();
        this.Description = new ArrayList<String>();

        this.Names.add(0,"1.Ayatul Kursi Arabic");
        this.Names.add(1,"2.Ayatul Kursi English");



        //this.Audio.add(0,"null");
        for(int i=1;i<=3;i++){
            this.Audio.add(i-1,"audio"+i);
        }

        for(int j=1;j<=3;j++){
            this.Images.add(j-1,"name"+j+"_small");
        }

        for(int k=1;k<=3;k++){
            this.BIG_Images.add(k-1,"name"+k);
        }

        for(int a=1;a<=3;a++){
            this.Wallpaper.add(a-1,"name"+a+"_wallpaper");
        }


        this.NamesSub.add(0,"Ayatul Kursi Arabic");
        this.NamesSub.add(1,"Ayatul Kursi English");



        this.Sub_heading.add(0,"اللَّهُ لاَ إِلَهَ إِلاَّ هُوَ الْحَيُّ الْقَيُّومُ لاَ تَأْخُذُهُ سِنَةٌ وَلاَ نَوْمٌ لَهُ مَا فِي السَّمَاوَاتِ وَمَا فِي الأَرْضِ مَنْ ذَا الَّذِي يَشْفَعُ عِنْدَهُ إِلاَّ بِإِذْنِهِ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ وَلاَ يُحِيطُونَ بِشَيْءٍ مِنْ عِلْمِهِ إِلاَّ بِمَا شَاءَ وَسِعَ كُرْسِيُّهُ السَّمَاو ;َاتِ وَالأَرْضَ وَلاَ يَئُودُهُ حِفْظُهُمَا وَهُوَ الْعَلِيُّ الْعَظِيمُ\n");
        this.Sub_heading.add(1,"آية الكرسي");


        // position 12  13  14 39 59 65 66 75 94
        this.Description.add(0,"Allah! There is no deity save Him, the Alive, the Eternal.\n" +
                "Neither slumber nor sleep overtaketh Him.\n" +
                "Unto Him belongeth whatsoever is in the heavens and whatsoever is in the earth.\n" +
                "Who is he that intercedeth with Him save by His leave?\n" +
                "He knoweth that which is in front of them and that which is behind them,\n" +
                "while they encompass nothing of His knowledge save what He will.\n" +
                "His throne includeth the heavens and the earth,\n" +
                "and He is never weary of preserving them.\n" +
                "He is the Sublime, the Tremendous.");
        this.Description.add(1,"Allahu laaa ilaaha illaa huwal haiyul qai-yoom; laa taakhuzuhoo sinatunw wa laa nawm; lahoo maa fissamaawaati wa maa fil ard; man zallazee yashfa'u indahooo illaa be iznih; ya'lamu maa baina aideehim wa maa khalfahum; wa laa yuheetoona beshai 'immin 'ilmihee illa be maa shaaaa; wasi'a kursiyyuhus samaa waati wal arda wa la ya'ooduho hifzuhumaa; wa huwal aliyyul 'azeem'");


    }

}
