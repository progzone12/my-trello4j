package org.trello4j.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.trello4j.model.Board.PERMISSION_TYPE;
import org.trello4j.model.TrelloType;

import java.lang.reflect.Type;

/**
 * Translate type string to TrelloType enum.
 *
 * @author joel
 *
 */
public class TrelloTypeDeserializer implements
		JsonDeserializer<TrelloType> {

	public TrelloType deserialize(JsonElement json, Type typeOfT,
			JsonDeserializationContext context) throws JsonParseException {
		final String jsonStr = json.getAsString();
		return jsonStr == null ? null : TrelloType.fromString(jsonStr);
	}

}