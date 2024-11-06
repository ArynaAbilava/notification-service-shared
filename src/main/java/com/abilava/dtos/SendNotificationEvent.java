package com.abilava.dtos;

import java.io.Serializable;

public record SendNotificationEvent(String content) implements Serializable { }
