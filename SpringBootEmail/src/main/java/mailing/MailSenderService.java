package mailing;

import javax.mail.MessagingException;

/**
 * <p>
 * Mail interface
 * </p>
 */
public interface MailSenderService {
	
    /**
     * Send text mail
     *
     * @param to      Receiver's address
     * @param subject Mail Subject
     * @param content Mail content
     * @param cc      Copy Address
     */
    void sendSimpleMail(String from, String to, String subject, String content, String... cc);

    /**
     * Send HTML email
     *
     * @param to      Receiver's address
     * @param subject Mail subject
     * @param content Mail content
     * @param cc      CC address
     * @throws MessagingException Mail exception
     */
    void sendHtmlMail(String from, String to, String subject, String content, String... cc) throws MessagingException;

    /**
     * Send email with attachment
     *
     * @param to       Receiver's address
     * @param subject  Mail subject
     * @param content  Mail content
     * @param filePath Attachment address
     * @param cc       CC address
     * @throws MessagingException Mail exception
     */
    void sendAttachmentsMail(String from, String to, String subject, String content, String filePath, String... cc) throws MessagingException;

    /**
     * Send email with static resources in the body
     *
     * @param to      Receiver's address
     * @param subject Mail subject
     * @param content Mail content
     * @param rscPath Static resource address
     * @param rscId   Static resource id
     * @param cc      CC address
     * @throws MessagingException Mail exception
     */
    void sendResourceMail(String from, String to, String subject, String content, String rscPath, String rscId, String... cc) throws MessagingException;

}
