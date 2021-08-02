//package com.example.study.controller;
//
//import io.restassured.response.Response;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.springframework.core.io.ClassPathResource;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//
//import static io.restassured.RestAssured.given;
//import static org.hamcrest.Matchers.hasItem;
//
//class BoardControllerTest {
//
//    private static final String address = "http://localhost:8081";
//
//    @Order(1)
//    @DisplayName("post 글쓰기 요청")
//    @Test
//    public void writeBoardTest() throws IOException {
//        File file = new ClassPathResource("board/board.json").getFile();
//        String json = new String(Files.readAllBytes(file.toPath()));
//
//        given()
//                .contentType("application/json").body(json)
//                .when()
//                .post(address + "/board/write")
//                .then()
//                .statusCode(200);
//    }
//
//    @Order(2)
//    @DisplayName("get Pagination BoardList 요청")
//    @Test
//    public void paginationBoardListTest() {
//
//        Response response = given()
//                .when()
//                .get(address + "/board/list?page=0");
//
//        response.then()
//                .statusCode(200)
//                .body("title", hasItem("게시글 테스트"));
//    }
//
//    @Order(3)
//    @DisplayName("post boardUpdate 요청")
//    @Test
//    public void updateBoardTest() throws IOException {
//
//        File file = new ClassPathResource("board/boardUpdate.json").getFile();
//        String json = new String(Files.readAllBytes(file.toPath()));
//
//        System.out.println(json);
//        given()
//                .contentType("application/json").body(json)
//                .when()
//                .post(address + "/board/update?id=1")
//                .then()
//                .statusCode(200);
//    }
//
//    @Order(4)
//    @DisplayName("post boardDelete 요청")
//    @Test
//    public void deleteBoardTest() {
//
//        given()
//                .when()
//                .delete(address + "/board/delete?id=3")
//                .then()
//                .statusCode(200);
//    }
//
//}