package cc.notalk.v.dao.book;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import cc.notalk.v.entity.book.BookUrl;

public interface BookUrlDao extends PagingAndSortingRepository<BookUrl, Long>, JpaSpecificationExecutor<BookUrl> {

	BookUrl findByUrl(String downloadUrl);

}