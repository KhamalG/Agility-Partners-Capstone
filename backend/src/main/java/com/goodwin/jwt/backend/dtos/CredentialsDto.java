package com.goodwin.jwt.backend.dtos;

public record CredentialsDto (String login, char[] password) { }