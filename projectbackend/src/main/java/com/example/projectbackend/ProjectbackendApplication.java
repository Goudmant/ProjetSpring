//https://github.com/FormWeb/FSJavaLaboSpring

package com.example.projectbackend;

import com.example.projectbackend.model.entity.Patient;
import com.example.projectbackend.model.entity.Post;
import com.example.projectbackend.model.entity.Questions;
import com.example.projectbackend.repository.PatientRepository;
import com.example.projectbackend.repository.PostRepository;
import com.example.projectbackend.repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class ProjectbackendApplication implements CommandLineRunner {

	@Autowired
	public PostRepository postRepository;

	@Autowired
	public PatientRepository patientRepository;

	@Autowired
	public QuestionsRepository questionsRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjectbackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Post newPost = new Post("Hi");
//		postRepository.save(newPost);
//
//		System.out.println("\n Find all : ");
//
//		List<Post> posts = postRepository.findAll();
//
//		for (Post post : posts) {
//			System.out.println(post.getMessage());
//		}
//
//		System.out.println("\n Find by message : ");
//
//		Post postFoundByMessage = postRepository.findByMessage("Hi");
//		System.out.println(postFoundByMessage.getId());
//
//		System.out.println("\n Find long posts : ");
//
//		List<Post> longPosts = postRepository.findLongPosts();
//
//		for (Post post : longPosts) {
//			System.out.println(post.getMessage());
//		}


	}


}
