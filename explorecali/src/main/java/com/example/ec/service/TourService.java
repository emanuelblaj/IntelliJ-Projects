package com.example.ec.service;

import com.example.ec.domain.Difficulty;
import com.example.ec.domain.Region;
import com.example.ec.domain.Tour;
import com.example.ec.domain.TourPackage;
import com.example.ec.repo.TourPackageRepository;
import com.example.ec.repo.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TourService {
    private TourRepository tourRepository;
    private TourPackageRepository tourPackageRepository;

    @Autowired
    public TourService(TourRepository tourRepository, TourPackageRepository tourPackageRepository) {
        this.tourRepository = tourRepository;
        this.tourPackageRepository = tourPackageRepository;
    }

    /*
    * create a new tour object and persist it to the database.
    *
    * @param title title
    * @param description description
    * @param blurb blurb
    * @param duration duration
    * @param bullets comma-separated bullets
    * @param keywords keywords
    * @param tourPackageName tour package name
    * @param difficulty difficulty
    * @param region region
    *@param Tour Entity
    */
    public Tour createTour(String title, String description, String blurb,
                           Integer price, String duration, String bullets,
                           String keywords, String tourPackageName,
                           Difficulty difficulty, Region region){
        TourPackage tourPackage = tourPackageRepository.findByName(tourPackageName)
                .orElseThrow(() -> new RuntimeException("Tour package does not exist" + tourPackageName));

        return tourRepository.save(new Tour(title, description, blurb,
                price, duration, bullets,
                keywords, tourPackage, difficulty, region));
    }

    /*
    * Calculate the number of Tours in the Database.
    *
    * @return the total.
    */

    public long total() {
        return tourRepository.count();
    }


}
