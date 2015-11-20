package cdoremus.stategeo.server.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class ApplicationUtils {
	private static final String DEFAULT_HASH_ALGORITHM = "SHA-256";
	private static final String CHAR_ENCODING = "UTF-8";
	
	private ApplicationUtils() {}
	
	public static byte[] createPasswordHash(String password) {
		return createPasswordHash(password, DEFAULT_HASH_ALGORITHM);
	}


	public static byte[] createPasswordHash(String password, String algorithm) {
		byte[] hash;
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			md.reset();
			hash = md.digest(password.getBytes(CHAR_ENCODING));
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
			hash = null;
		}
		return hash;
	}
}
