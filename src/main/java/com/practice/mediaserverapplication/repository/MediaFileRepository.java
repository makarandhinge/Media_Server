package com.practice.mediaserverapplication.repository;

import com.practice.mediaserverapplication.model.MediaFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaFileRepository extends JpaRepository<MediaFile, Long> {

}
