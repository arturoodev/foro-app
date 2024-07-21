package com.arturocode.appforo.service;

import com.arturocode.appforo.dto.CourseDTO;

import java.util.List;

public interface CourseService {
    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();

    CourseDTO getCourseById(Integer id);

    CourseDTO updateCourse(CourseDTO course);

    void deleteCourse(Integer id);

}