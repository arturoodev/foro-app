package com.arturocode.appforo.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturocode.appforo.dto.CourseDTO;
import com.arturocode.appforo.entity.Course;
import com.arturocode.appforo.mapper.CourseMapper;
import com.arturocode.appforo.repository.CourseRepository;
import com.arturocode.appforo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public CourseDTO createCourse(CourseDTO courseDTO) {
        Course course = CourseMapper.convertToClass(courseDTO);
        Course courseSaved = courseRepository.save(course);

        CourseDTO courseSavCourseDTO = CourseMapper.convertToDto(courseSaved);
        return courseSavCourseDTO;
    }

    @Override
    public List<CourseDTO> getAllCourses() {
        List<Course> courses = courseRepository.findAll();
        return courses.stream().map(CourseMapper::convertToDto)
                .collect(Collectors.toList());
    }

    @Override
    public CourseDTO getCourseById(Integer id) {
        Optional<Course> optCourse = courseRepository.findById(id);
        Course course = optCourse.get();
        return CourseMapper.convertToDto(course);
    }

    @Override
    public CourseDTO updateCourse(CourseDTO course) {
        Course courseDb = courseRepository.findById(course.getId()).get();
        courseDb.setName(course.getName());
        courseDb.setCategory(course.getCategory());
        Course courseUpdated = courseRepository.save(courseDb);
        return CourseMapper.convertToDto(courseUpdated);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseRepository.deleteById(id);
    }

}
