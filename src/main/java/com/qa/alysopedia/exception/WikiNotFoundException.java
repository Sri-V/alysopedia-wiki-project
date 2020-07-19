package com.qa.alysopedia.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "This wiki does not exist")
public class WikiNotFoundException extends EntityNotFoundException {
}