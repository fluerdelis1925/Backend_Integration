package com.backend.integration.Entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FinalScore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long fscore_id;
    private Integer final_score;
    
    private String remarks;


    @ManyToOne
    @JoinColumn(name = "enrollment_id")
    private Enrollment enrollment;


    @Column(name="end_date", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDate end_date;

    public Long getFscore_id() {
        return this.fscore_id;
    }

    public void setFscore_id(Long fscore_id) {
        this.fscore_id = fscore_id;
    }

    public Integer getFinal_score() {
        return this.final_score;
    }

    public void setFinal_score(Integer final_score) {
        this.final_score = final_score;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Enrollment getEnrollment() {
        return this.enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public LocalDate getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(LocalDate end_date) {
        this.end_date = end_date;
    }


   
   
   
}   
