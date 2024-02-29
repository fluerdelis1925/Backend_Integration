package com.backend.integration.Repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.backend.integration.Entity.Topic;

import jakarta.transaction.Transactional;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    // Interface definition for TopicRepository extending JpaRepository for Topic entity with Long as the ID type

    List<Topic> findAll(); // Method to find all topics

    Optional<Topic> findById(Long topic_id); // Method to find a topic by its ID

    // // Custom query to find topics by chapter ID using named parameter ":chapter_id"
    // @Query("SELECT t FROM Topic t WHERE t.chapter.chapter_id = :chapter_id")
    // List<Topic> findByChapter_id(@Param("chapter_id") Long chapter_id);
    
    //query for deleting topic inside course
    @Transactional
    @Modifying
    @Query("DELETE FROM Topic t WHERE t.topic_id = :topic_id")
    void deleteTopicById(@Param("topic_id") Long topic_id);
}
