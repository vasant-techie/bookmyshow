package com.bookmyshow.consumer.api.repo;

import com.bookmyshow.consumer.api.entity.Show;
import com.bookmyshow.consumer.api.entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Long> {
    List<Show> findAll();

/*    @Query(value = "SELECT t.* FROM bms.shows s, bms.movies m, bms.theatres t " +
            "WHERE m.movieid = s.movieid AND m.moviename = :movieName " +
            "AND t.theatreid = s.theatreid AND t.city = :city " +
            "AND :showDate BETWEEN s.startdate AND s.enddate " +
            "AND s.showtime = :showTime"
            , nativeQuery = true)*/
    @Query("SELECT t FROM Show s " +
            "JOIN s.movie m " +
            "JOIN s.theatre t " +
            "WHERE m.movieName = :movieName " +
            "AND t.city = :city " +
            "AND :showDate BETWEEN s.startDate AND s.endDate " +
            "AND s.showTime = :showTime")
    List<Theatre> findTheatresByMovieCityAndMovieNameAndMovieDateAndMovieTime(@Param("city") String city,
                                                                              @Param("movieName") String movieName,
                                                                              @Param("showDate") LocalDate showDate,
                                                                              @Param("showTime") LocalTime showTime
    );

    //List<Theatre> findTheatresByTheatreCityAndShowTimeAndMovieMovieNameAndStartDateBeforeAndEndDateAfter(String city, LocalTime showTime, String movieName, LocalDate showDate);

}