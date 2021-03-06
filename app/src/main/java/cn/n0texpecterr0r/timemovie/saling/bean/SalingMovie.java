package cn.n0texpecterr0r.timemovie.saling.bean;

import com.google.gson.annotations.SerializedName;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 上映中电影
 *
 * @author N0tExpectErr0r
 * @time 2019/01/10
 */
@Entity
public class SalingMovie {

    /**
     * NearestCinemaCount : 133
     * NearestDay : 1547020800
     * NearestShowtimeCount : 2340
     * aN1 : 海莉·斯坦菲尔德
     * aN2 : 小豪尔赫·兰登伯格
     * actors : 海莉·斯坦菲尔德 / 小豪尔赫·兰登伯格 / 约翰·塞纳 / 迪伦·奥布莱恩
     * cC : 134
     * commonSpecial : 大黄蜂化身地球守卫者
     * d : 113
     * dN : 塔拉维斯·奈特
     * def : 0
     * id : 246986
     * img : http://img5.mtime.cn/mt/2018/12/04/160518.62113167_1280X720X2.jpg
     * is3D : true
     * isDMAX : true
     * isFilter : false
     * isHasTrailer : true
     * isHot : true
     * isIMAX : false
     * isIMAX3D : true
     * isNew : false
     * isTicket : true
     * m : 
     * movieId : 246986
     * movieType : 动作 / 冒险 / 科幻
     * p : ["动作冒险科幻"]
     * preferentialFlag : false
     * r : 7.5
     * rc : 0
     * rd : 20190104
     * rsC : 0
     * sC : 4262
     * t : 大黄蜂
     * tCn : 大黄蜂
     * tEn : Bumblebee
     * ua : -1
     * versions : [{"enum":1,"version":"2D"},{"enum":2,"version":"3D"},{"enum":4,"version":"IMAX3D"},{"enum":6,"version":"中国巨幕"}]
     * wantedCount : 1650
     * year : 2018
     */

    @SerializedName("aN1")
    private String actor1;
    @SerializedName("aN2")
    private String actor2;
    private String actors;
    @SerializedName("cC")
    private int cinemaCount;
    @SerializedName("commonSpecial")
    private String description;
    @SerializedName("d")
    private String filmLong;
    @SerializedName("dN")
    private String director;
    private Long id;
    private String img;
    private boolean is3D;
    private boolean isDMAX;
    private boolean isHasTrailer;
    private boolean isHot;
    private boolean isIMAX;
    private boolean isIMAX3D;
    private boolean isNew;
    private boolean isTicket;
    private int movieId;
    private String movieType;
    @SerializedName("r")
    private double score;
    @SerializedName("rd")
    private String date;
    @SerializedName("tCn")
    private String nameCn;
    @SerializedName("tEn")
    private String nameEn;
    private int wantedCount;
    private int locationId;

    @Generated(hash = 1824995337)
    public SalingMovie(String actor1, String actor2, String actors, int cinemaCount, String description, String filmLong,
            String director, Long id, String img, boolean is3D, boolean isDMAX, boolean isHasTrailer, boolean isHot, boolean isIMAX,
            boolean isIMAX3D, boolean isNew, boolean isTicket, int movieId, String movieType, double score, String date,
            String nameCn, String nameEn, int wantedCount, int locationId) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actors = actors;
        this.cinemaCount = cinemaCount;
        this.description = description;
        this.filmLong = filmLong;
        this.director = director;
        this.id = id;
        this.img = img;
        this.is3D = is3D;
        this.isDMAX = isDMAX;
        this.isHasTrailer = isHasTrailer;
        this.isHot = isHot;
        this.isIMAX = isIMAX;
        this.isIMAX3D = isIMAX3D;
        this.isNew = isNew;
        this.isTicket = isTicket;
        this.movieId = movieId;
        this.movieType = movieType;
        this.score = score;
        this.date = date;
        this.nameCn = nameCn;
        this.nameEn = nameEn;
        this.wantedCount = wantedCount;
        this.locationId = locationId;
    }

    @Generated(hash = 238595158)
    public SalingMovie() {
    }

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getCinemaCount() {
        return cinemaCount;
    }

    public void setCinemaCount(int cinemaCount) {
        this.cinemaCount = cinemaCount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFilmLong() {
        return filmLong;
    }

    public void setFilmLong(String filmLong) {
        this.filmLong = filmLong;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean is3D() {
        return is3D;
    }

    public void set3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean isDMAX() {
        return isDMAX;
    }

    public void setDMAX(boolean DMAX) {
        isDMAX = DMAX;
    }

    public boolean isHasTrailer() {
        return isHasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        isHasTrailer = hasTrailer;
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isIMAX() {
        return isIMAX;
    }

    public void setIMAX(boolean IMAX) {
        isIMAX = IMAX;
    }

    public boolean isIMAX3D() {
        return isIMAX3D;
    }

    public void setIMAX3D(boolean IMAX3D) {
        isIMAX3D = IMAX3D;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isTicket() {
        return isTicket;
    }

    public void setTicket(boolean ticket) {
        isTicket = ticket;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public int getWantedCount() {
        return wantedCount;
    }

    public void setWantedCount(int wantedCount) {
        this.wantedCount = wantedCount;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public boolean getIs3D() {
        return this.is3D;
    }

    public void setIs3D(boolean is3D) {
        this.is3D = is3D;
    }

    public boolean getIsDMAX() {
        return this.isDMAX;
    }

    public void setIsDMAX(boolean isDMAX) {
        this.isDMAX = isDMAX;
    }

    public boolean getIsHasTrailer() {
        return this.isHasTrailer;
    }

    public void setIsHasTrailer(boolean isHasTrailer) {
        this.isHasTrailer = isHasTrailer;
    }

    public boolean getIsHot() {
        return this.isHot;
    }

    public void setIsHot(boolean isHot) {
        this.isHot = isHot;
    }

    public boolean getIsIMAX() {
        return this.isIMAX;
    }

    public void setIsIMAX(boolean isIMAX) {
        this.isIMAX = isIMAX;
    }

    public boolean getIsIMAX3D() {
        return this.isIMAX3D;
    }

    public void setIsIMAX3D(boolean isIMAX3D) {
        this.isIMAX3D = isIMAX3D;
    }

    public boolean getIsNew() {
        return this.isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public boolean getIsTicket() {
        return this.isTicket;
    }

    public void setIsTicket(boolean isTicket) {
        this.isTicket = isTicket;
    }
}
